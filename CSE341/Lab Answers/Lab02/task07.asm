.MODEL SMALL
 
.STACK 100H

.DATA 
prompt db "ENTER A HEX DIGIT (A-F): $" 
prompt2 db "IN DECIMAL IT IS: $" 

.CODE 
MAIN PROC 

;iniitialize DS

MOV AX,@DATA 
MOV DS,AX      

;Code here

LEA DX, prompt
MOV AH, 9
INT 21H

MOV AH, 1
INT 21H
MOV BL, AL


MOV DL, 0AH
MOV AH, 2
INT 21H

MOV DL, 0DH
MOV AH, 2
INT 21H

MOV DL, prompt2
MOV AH, 2
INT 21H     

SUB BL, 11H

MOV DL, BL
MOV AH, 2
INT 21H



;exit to DOS 
               
MOV AX,4C00H
INT 21H 

MAIN ENDP
    END MAIN 