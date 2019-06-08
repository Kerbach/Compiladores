.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static square(II)V
        iload 0
        iload 1
        imul
        istore 2

    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 2
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        return
.limit locals 3
.limit stack 2
.end method

.method public static main([Ljava/lang/String;)V
        ldc 8
        ldc 2
        invokestatic Test/square(II)V
        return
.limit locals 1
.limit stack 2
.end method
; symbols: [args]
