.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static cube()V
        ldc 4
        istore 0

    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 0
        iload 0
        imul
        iload 0
        imul
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        return
.limit locals 1
.limit stack 3
.end method

.method public static main([Ljava/lang/String;)V
        ldc 1
        istore 1

        invokestatic Test/cube()V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 1
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        return
.limit locals 2
.limit stack 2
.end method
; symbols: [args, n]
