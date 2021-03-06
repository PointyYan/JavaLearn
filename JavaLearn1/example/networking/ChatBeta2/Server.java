package example.networking.ChatBeta2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        new Server().startServer();
    }

    public void startServer(){
        try {
            //服务器在9990端口监听客户端的连接
            ServerSocket ss = new ServerSocket(9998);
            System.out.println("server is listening...");
            while(true){
                //阻塞的accept方法，当一个客户端连接上，才会返回Socket对象
                Socket s = ss.accept();
                System.out.println("a client has connected!");
                //开启线程处理通信
                new CommunicateThread(s).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class CommunicateThread extends Thread{

        Socket socket;
        DataInputStream dis;
        DataOutputStream dos;

        public CommunicateThread(Socket socket){
            this.socket = socket;
            try {
                dis = new DataInputStream(socket.getInputStream());
                dos = new DataOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            super.run();
            //读取客户端发过来的消息
            String msg = null;
            try {
                while((msg = dis.readUTF()) != null){
                    System.out.println("client send msg ：" + msg);
                    String replyMsg = "server reply ： " + msg;
                    dos.writeUTF(replyMsg);
                    System.out.println("server reply msg ：" + replyMsg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}