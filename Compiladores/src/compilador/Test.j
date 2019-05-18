.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
        new List
        dup
        invokespecial List/<init>()V
        astore 1

        aload 1

        ldc 123
        invokevirtual List/append(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        aload 1
        invokevirtual List/len()I
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        aload 1
        invokevirtual List/str()Ljava/lang/String;
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        aload 1

        ldc 0
        ldc 456
        invokevirtual List/set(II)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        aload 1
        ldc 0
        invokevirtual List/get(I)I
        invokevirtual java/io/PrintStream/println(I)V
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        return
.limit locals 2
.limit stack 2
.end method
; symbols: [args, l]
