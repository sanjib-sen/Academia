   .MODEL SMALL
 
.STACK 100H

.DATA 
arr1	db	30	dup(?)
newline DB 0AH,0DH,"$"
arr2	db	5	dup(?)
arr3	db	3	dup(?)

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here  



;Task 01
;Take input the length of the user�s name. Then, take the name as input, and then display.   


MOV AH, 1
INT 21H
SUB AL, 30H
MOV CL, AL
MOV BL, CL
MOV SI, 0
MOV AH, 1
    
START11:
INT 21H
MOV arr1[SI], AL
DEC CL
INC SI

CMP CL, 0
JNE START11 


MOV dl, 10
MOV ah, 2
INT 21h
MOV dl, 13
MOV ah, 2
INT 21h

MOV CL, BL
mov ah,2
mov si,0
start:
mov dl,arr1[si]
int 21h
add si,1
DEC CL
CMP CL, 0
JNE start


;Task 02
;Take an array of size 5, then taking input from the user, sort the array in the ascending
;order.       

; Creating two new lines
MOV dl, 10
MOV ah, 2
INT 21h
MOV dl, 13
MOV ah, 2
INT 21h
MOV dl, 10
MOV ah, 2
INT 21h
MOV dl, 13
MOV ah, 2
INT 21h

; Input
MOV CX, 5
MOV SI, 0
MOV AH, 1
    
START21:
INT 21H
MOV arr2[SI], AL
INC SI

LOOP START21

MOV dl, 10
MOV ah, 2
INT 21h
MOV dl, 13
MOV ah, 2
INT 21h

MOV BL, 4                  
first:
CMP BL, -1
JE end
DEC BL

MOV BH, 3
MOV SI, 0
MOV DI, 1

second:
CMP BH, -1
JE first
DEC BH


MOV AL, arr2[SI]
MOV AH, arr2[DI]

CMP AL,AH
JG change
JNG nochange

change:
MOV DL, arr2[SI]
MOV DH, arr2[DI]
MOV arr2[SI], DH
MOV arr2[DI], DL

INC SI
INC DI
JMP second

nochange:
INC SI
INC DI
JMP second

end: 
mov cx,5
mov ah,2
mov si,0
print:
mov dl,arr2[si]
int 21h
add si,1
loop print


;Task 03
;Take three inputs from the user and find the maximum of the three numbers. 

; Creating two new lines

MOV dl, 10
MOV ah, 2
INT 21h
MOV dl, 13
MOV ah, 2
INT 21h
MOV dl, 10
MOV ah, 2
INT 21h
MOV dl, 13
MOV ah, 2
INT 21h

; input

MOV CX, 3
MOV SI, 0
MOV AH, 1
    
START31:
INT 21H
MOV arr3[SI], AL
INC SI

LOOP START31


MOV dl, 10
MOV ah, 2
INT 21h
MOV dl, 13
MOV ah, 2
INT 21h


MOV BL, 2                  
first2:
CMP BL, -1
JE end2
DEC BL

MOV BH, 1
MOV SI, 0
MOV DI, 1

second2:
CMP BH, -1
JE first2
DEC BH


MOV AL, arr3[SI]
MOV AH, arr3[DI]

CMP AL,AH
JG change2
JNG nochange2

change2:
MOV DL, arr3[SI]
MOV DH, arr3[DI]
MOV arr3[SI], DH
MOV arr3[DI], DL

INC SI
INC DI
JMP second2

nochange2:
INC SI
INC DI
JMP second2

end2: 
mov ah,2
mov si,2
mov dl,arr3[si]
int 21h



;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 