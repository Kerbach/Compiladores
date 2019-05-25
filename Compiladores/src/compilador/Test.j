.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
        ldc 2
        istore 1

        new List
        dup
        invokespecial List/<init>()V
        astore 2

        aload 2
        ldc 1
        invokevirtual List/append(I)V
        ldc "Z"
        astore 3

        new List
        dup
        invokespecial List/<init>()V
        astore 1

        new List
        dup
        invokespecial List/<init>()V
        astore 2

        new List
        dup
        invokespecial List/<init>()V
        astore 3

        ldc 2
        istore 2

        aload 2

    iload 2
        ldc 2
        invokevirtual List/set(II)V
        aload 2

    aload 3
        ldc 2
        invokevirtual List/set(II)V
        aload 1

        ldc 0
        ldc 2
        invokevirtual List/set(II)V
        aload 2

        ldc 0
    iload 2
        invokevirtual List/set(II)V
        aload 2

        ldc 0
    aload 3
        invokevirtual List/set(II)V
        aload 3

        ldc 0
        ldc 2
        invokevirtual List/set(II)V
        aload -1

        ldc 0
        ldc 2
        invokevirtual List/set(II)V
    iload 2
        istore 1

        aload 1
        ldc 0
        invokevirtual List/get(I)I
        istore 1

        aload 3
        ldc 0
        invokevirtual List/get(I)I
        istore 1

        ldc 0
        invokevirtual List/get(I)I
        aload 1
        invokevirtual List/len()I
        istore 1

        aload 3
        invokevirtual List/len()I
        istore 1

        aload -1
        invokevirtual List/len()I
        istore 1

        aload 1
        invokevirtual List/str()Ljava/lang/String;
        astore 3

        aload 3
        invokevirtual List/str()Ljava/lang/String;
        astore 3

        aload -1
        invokevirtual List/str()Ljava/lang/String;
        astore 3

    
        getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    iload 2
    iadd
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    iload 1
    isub
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    iload 2
        imul
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    aload 3
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 8
    iload 2
        irem
        invokevirtual java/io/PrintStream/println(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
BEGIN_WHILE_1:
    iload 2
        ldc 2
    
if_icmple END_WHILE_1
        ldc 1
        istore 1

        goto BEGIN_WHILE_1
END_WHILE_1:
        ldc 2
    iload 2
    
if_icmpgt NOT_IF_1
        ldc 2
        istore 1

NOT_IF_1:
    iload 2
    iload 2
    
if_icmpne NOT_IF_2
        ldc 3
        istore 1

NOT_IF_2:
        return
.limit locals 7
.limit stack 10
.end method
; symbols: [args, i, l, s, i, l, s]
