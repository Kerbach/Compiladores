.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static test()V
        ldc 1
    istore 0
        return
.limit locals 1
.limit stack 1
.end method

.method public static test()V
        ldc 1
    istore 0
        return
.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V
        invokestatic Test/test()V
        invokestatic Test/sort()V
        return
.limit locals 1
.limit stack 0
.end method
; symbols: [args]
