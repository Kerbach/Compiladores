.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
        ldc 1
        istore 1

BEGIN_WHILE_1:
        iload 1
        ldc 10
    
if_icmpge END_WHILE_1
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 1
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        iload 1
        ldc 1
        iadd
        istore 1

        goto BEGIN_WHILE_1
END_WHILE_1:
        return
.limit locals 2
.limit stack 2
.end method
; symbols: [args, a]
