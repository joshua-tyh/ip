public class Deadline extends Task{
    private final String deadline;
    public Deadline(String description, String deadline) {
        super(description);
        this.deadline = deadline;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[D]" + super.toString() + " (by: " + this.deadline + ")");
        return sb.toString();
    }
}
