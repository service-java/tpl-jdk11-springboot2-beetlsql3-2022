package com.example.demo;

import com.example.demo.util.GenCodeAndDocUtils;
import lombok.extern.java.Log;
import org.beetl.sql.core.SQLManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@Log
@SpringBootTest
class GenCodeApplicationTests {

    @Value("${spring.datasource.driver-class-name}")
    String driver;
    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String userName;
    @Value("${spring.datasource.password}")
    String password;

    String tplPath = "/src/test/resources/templates/";
    String basePackageName = "com.ibeetlcodegen.demo";

    // 要生成的表格名
    List<String> tableNames = Arrays.asList(
             "user"
            // , "user_copy"
    );

    @Test
    void genCode() {
        // //为了简单起见，俩个sqlManager都来自同一个数据源，实际是不同数据库，甚至是NOSQL
        SQLManager sqlManager = GenCodeAndDocUtils.getDataSource(driver, url, userName, password);
        GenCodeAndDocUtils.initGroupTemplate(tplPath);

        if (tableNames.size() > 0) {
            tableNames.stream().forEach(tableName -> {
                GenCodeAndDocUtils.genCode(sqlManager, basePackageName, tableName);
                // GenCodeAndDocUtils.genDoc(sqlManager, basePackageName, tableName);
            });
        }

    }


}
