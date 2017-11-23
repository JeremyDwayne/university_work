.text
.data
heads_message:
	.asciz "H %d\n"
tails_message:
	.asciz "T %d\n"
.global main

main:
	mov r0, #0
	bl time
	bl srand
	bl rand

	mov r1, r0
	and r0, r0, #1
	cmp r0, #1

	beq else

	ldr r0, =heads_message
	b end
else:
	ldr r0, =tails_message
end:

	bl printf
	mov pc, lr
