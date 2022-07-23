package cn.me.study.Stu2022.test.Nio.socketChannel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

//使用mo兴理解闭去模式,能纹桎
// 0. ByteBuffer
        ByteBuffer buffer = ByteBuffer.allocate(16);
//1.创建了服务海
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.configureBlocking(false); //
// 2.堪定监听端n
        ssc.bind(new InetSocketAddress(8988));
// 3.连接笠合
        List<SocketChannel> channels = new ArrayList<>();
        while (true) {
// 4. accept小力。名户戏11星.Socketchannel用於UW户布之间遇A
            SocketChannel sc = ssc.accept(); // --二 1
            if (sc != null) {
            }
            for (SocketChannel channel : channels) {
// 5.接收客广璃发送的故据
                int read = channel.read(buffer);// “
                if (read > 0) {
                }
            }
        }
    }
}
