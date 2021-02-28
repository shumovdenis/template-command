public class FrogCommands {
    public static FrogCommand jumpCommand(Frog frog, int steps) {
        // возвращаете объект команды, у которого
        // если вызвать .do(), то лягушка её выполнит,
        // если вызвать .undo(), то лягушка её отменит
        if (steps > 0) return new JumpRight(frog, steps);
        else return new JumpLeft(frog, steps);
    }
}
