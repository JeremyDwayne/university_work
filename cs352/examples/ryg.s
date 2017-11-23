.text
.global main

main:
	push {lr}

	sub r0, r0, #1

	mov r0, #0
	cmp r0, #0
	beq red
	mov r0, #1
	cmp r0, #1
	beq yellow
	mov r0, #2
	cmp r0, #2
	beq green

	red:
		mov r1, #82
		b end
	yellow:
		mov r1, #89
		b end
	green:
		mov r1, #72
	end:
		mov r0, =message
		bl printf

	pop {lr}
	mov pc, lr

jumptable:
	.word red, yellow, green

.data
message:
	.asciz "Color: %c\n"
