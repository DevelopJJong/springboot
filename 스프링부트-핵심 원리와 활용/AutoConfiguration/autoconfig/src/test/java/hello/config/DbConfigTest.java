package hello.config;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class DbConfigTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    TransactionManager transactionManager;

    @Test
    void checkBean(){
        log.info("dataSource = {}", dataSource);
        log.info("TransactionManager = {}", transactionManager);
        log.info("JdbcTemplate = {}", jdbcTemplate);

        Assertions.assertThat(dataSource).isNotNull();
        Assertions.assertThat(transactionManager).isNotNull();
        Assertions.assertThat(jdbcTemplate).isNotNull();
    }
}