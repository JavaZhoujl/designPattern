package com.zhoujl.tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Description: tcp客户端
 *          socket->套接字
 * @Date: 2019年05月29日 下午 21:27
 * @author: zhoujl
 * @Version: 1.0
 */
public class SocketClien {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket ("localhost", 8080);

			PrintWriter writer = new PrintWriter (socket.getOutputStream (), true);

			writer.write ("hello world!");
		} catch (IOException e) {
			e.printStackTrace ();
		}
	}
}
