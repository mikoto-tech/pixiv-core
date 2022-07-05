package net.mikoto.pixiv.core.model;

/**
 * @author mikoto
 * @date 2022/6/18 17:41
 */
public class DatabaseServer extends HttpServer {
    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nDatabaseServer{" +
                "address='" + super.getAddress() + '\'' +
                '}';
    }
}