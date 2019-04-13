.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V
        ldc 0
        ldc 1
    
        if_icmpge NOT_IF_1
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 0
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        ldc 0
        ldc 1
    
        if_icmpge NOT_IF_2
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 3
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        NOT_IF_2:
        NOT_IF_1:
        return
.limit locals 1
.limit stack 2
.end method
; symbols: [args]
