package exemple5;

public class DataAcessLayer {
    private Logger logger;

    public DataAcessLayer(Logger logger) {
        this.logger = logger;
    }

    public void AddCustomer(String name) {
        logger.Log("Customer added: " + name);
    }
}
