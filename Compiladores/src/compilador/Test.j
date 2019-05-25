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
