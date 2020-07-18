<?php


final class UpdateUseCase
{
    private UpdateQueryInterface $query;

    private UpdateCommandInterface $command;

    /**
     * UpdateUseCase constructor.
     * @param UpdateQueryInterface $query
     * @param UpdateCommandInterface $command
     */
    public function __construct(UpdateQueryInterface $query, UpdateCommandInterface $command)
    {
        $this->query = $query;
        $this->command = $command;
    }

    public function exec(UpdateInput $input): UpdateOutput
    {
        unset($input);

        $this->command->save(
            $this->query->find()
        );

        return new UpdateOutput;
    }
}