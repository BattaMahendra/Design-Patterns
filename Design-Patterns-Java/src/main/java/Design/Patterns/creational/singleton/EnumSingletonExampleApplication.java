package Design.Patterns.creational.singleton;

import javax.sql.DataSource;

public enum EnumSingletonExampleApplication {
    INSTANCE;

    private final DataSource dataSource;

    // The enum constructor is private and thread-safe by default
    EnumSingletonExampleApplication() {
//        MysqlDataSource ds = new MysqlDataSource();
//        ds.setUser("root");
//        ds.setPassword("s3cr3t");
//        ds.setURL("jdbc:mysql://localhost:3306/myDatabase");
        this.dataSource = null;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}