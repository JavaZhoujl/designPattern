package com.zhoujl.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Description: tcp服务端
 *
 * @Date: 2019年05月29日 下午 21:29
 * @author: zhoujl
 * @Version: 1.0
 */
public class SocketServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket (8080);

			//接收客户端的连接（阻塞）
			Socket accept = serverSocket.accept ();
			BufferedReader reader = new BufferedReader (new InputStreamReader
					(accept.getInputStream ()));
			System.out.println (reader.readLine ());
		} catch (IOException e) {
			e.printStackTrace ();
		}
	}

}
