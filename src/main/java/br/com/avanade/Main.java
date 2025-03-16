package br.com.avanade;

import br.com.avanade.persistence.migration.MigrationStrategy;

import java.sql.SQLException;

import static br.com.avanade.persistence.config.ConnectionConfig.getConnection;

public class Main {
    public static void main(String[] args) throws SQLException {
        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}