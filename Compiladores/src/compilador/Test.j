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
        ldc "abc"
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc 1
        invokevirtual java/io/PrintStream/print(I)V
    
        getstatic java/lang/System/out Ljava/io/PrintStream;
        invokevirtual java/io/PrintStream/println()V
        return
.limit locals 1
.limit stack 3
.end method
; symbols: [args]
