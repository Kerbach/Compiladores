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

        ldc "X"
        astore 2

        ldc 2
        istore 3

        ldc "Y"
        astore 4

        ldc 3
        istore 1

        iload 1
        istore 3

        ldc "Z"
        aload 2
        invokestatic Runtime/readString()Ljava/lang/String;
        ldc "Q"
        astore 2

        aload 2
        astore 4

        ldc 4
        iload 3
        invokestatic Runtime/readInt()I
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 123
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc "xyz"
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 1
        aload 2
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload 3
        aload 4
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        aload 2
        ldc "W"
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        aload 4
        aload 2
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 8
        aload 2
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        iload 1
        aload 2
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 456
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
NOT_IF_1:
BEGIN_WHILE_1:
        aload 4
        ldc 4
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc "hello!"
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        goto BEGIN_WHILE_1
END_WHILE_1:
        return
.limit locals 5
.limit stack 20
.end method
; symbols: [args, a, x, b, y]
