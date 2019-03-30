.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
        ldc 4
        istore 1

        ldc 8
        istore 2

    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 1
        iload 2
        imul
    
        invokevirtual java/io/PrintStream/println(I)V

        ldc 16
        istore 1

        return
.limit locals 3
.limit stack 3
.end method
; symbols: [args, a, b]
