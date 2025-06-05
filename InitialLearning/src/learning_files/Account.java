package learning_files;

public record Account(
        int id,
        int customerId,
        String type,
        double balance) {}

//record items are defined in the (), followed by {}
