.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc 1

    invokevirtual java/io/PrintStream/println(I)V

    ldc 5
    ldc 3
    imul
    istore 1


    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    ldc 15
    isub

    invokevirtual java/io/PrintStream/println(I)V

    return
.limit locals 2
.limit stack 10
.end method
