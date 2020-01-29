public class Deadline extends Task{
    protected String deadline;
    protected String eventType;

    public Deadline(String description, String deadline){
        super(description);
        this.deadline = deadline;
        this.eventType = "[D]";
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getDeadline() {
        return String.format("(%s)", this.deadline);
    }

    @Override
    public String getDescriptionInListFormat() {
        return String.format("%s%s%s", getEventType(),
                super.getDescriptionInListFormat(), getDeadline());
    }

    @Override
    public String getDoneResponseMessage(int itemIndexRequested) {
        return String.format("[%d. %s%s %s%s] is marked done!", itemIndexRequested, getEventType(),
                super.getStatusIcon(), super.getDescription(), getDeadline());
    }
}
