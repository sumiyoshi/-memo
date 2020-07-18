<?php


final class ReadUseCase
{
    private ReadQueryInterface $query;

    /**
     * ReadUseCase constructor.
     * @param ReadQueryInterface $query
     */
    public function __construct(ReadQueryInterface $query)
    {
        $this->query = $query;
    }

    public function exec(ReadInput $input): ReadOutput
    {
        unset($input);

        $this->query->select();

        return new ReadOutput;
    }

}