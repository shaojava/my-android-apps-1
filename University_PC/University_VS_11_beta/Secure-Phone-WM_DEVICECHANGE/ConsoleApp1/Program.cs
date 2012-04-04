using System;
using System.Text;
using System.Net.Sockets;
using System.Threading;
using System.Net;

namespace TCPServerRedirectedOfADB
{
    class Server
    {
        private TcpListener tcpListener;
        private Thread listenThread;

        public static void Main(string[] args)
        {

            Server server = new Server(22221);
        }

        public Server(int portno)
        {
            this.tcpListener = new TcpListener(IPAddress.Any, portno);
            this.listenThread = new Thread(new ThreadStart(ListenForClients));
            this.listenThread.Start();
        }

        private void ListenForClients()
        {
            this.tcpListener.Start();

            while (true)
            {
                //blocks until a client has connected to the server
                TcpClient client = this.tcpListener.AcceptTcpClient();

                
                //create a thread to handle communication 
                //with connected client
                Thread clientThread = new Thread(new ParameterizedThreadStart(HandleClientComm));
                clientThread.Start(client);
            }
        }

        private void HandleClientComm(object client)
        {
            TcpClient tcpClient = (TcpClient)client;
            NetworkStream clientStream = tcpClient.GetStream();

            byte[] message = new byte[4096];
            int bytesRead;

            while (true)
            {
                bytesRead = 0;

                try
                {
                    //blocks until a client sends a message
                    bytesRead = clientStream.Read(message, 0, 4096);

                    //message has successfully been received
                    ASCIIEncoding encoder = new ASCIIEncoding();
       //             System.Diagnostics.Debug.WriteLine(encoder.GetString(message, 0, bytesRead));
                    Console.WriteLine(encoder.GetString(message, 0, bytesRead));


                }
                catch
                {
                    //a socket error has occured
                    break;
                }

                if (bytesRead == 0)
                {
                    //the client has disconnected from the server
                    break;
                }

                //message has successfully been received
                //ASCIIEncoding encoder = new ASCIIEncoding();
                //System.Diagnostics.Debug.WriteLine(encoder.GetString(message, 0, bytesRead));
            }

            tcpClient.Close();
        }
    }
}
