.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static factorial(I)I
        iload 0
        ldc 1
    
if_icmpgt NOT_IF_1
        ldc 1
    ireturn
NOT_IF_1:
        iload 0
        iload 0
        ldc 1
    isub
        invokestatic Test/factorial(I)I
        imul
    ireturn
        return
.limit locals 1
.limit stack 3
.end method

.method public static main([Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 5
        invokestatic Test/factorial(I)I
    invokevirtual java/io/PrintStream/print(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        return
.limit locals 1
.limit stack 2
.end method
; symbols: [args]
