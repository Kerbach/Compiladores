.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static greater(II)I
        iload 0
        istore 2

        iload 1
        iload 2
    
if_icmple NOT_IF_1
        iload 1
        istore 2

NOT_IF_1:
        iload 2
    ireturn
        return
.limit locals 3
.limit stack 2
.end method

.method public static main([Ljava/lang/String;)V
        ldc 8
        istore 1

    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 4
        iload 1
        invokestatic Test/greater(II)I
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        return
.limit locals 2
.limit stack 3
.end method
; symbols: [args, x]
