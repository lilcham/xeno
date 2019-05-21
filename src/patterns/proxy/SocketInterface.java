package patterns.proxy;

// 5. To support plug-compatibility between
// the wrapper and the target, create an interface
interface SocketInterface {
    String readLine();
    void  writeLine(String str);
    void  dispose();
}
