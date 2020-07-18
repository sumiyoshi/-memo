<?php


final class ReadAdapter implements ReadQueryInterface
{
    private SampleRepository $repository;

    /**
     * ReadAdapter constructor.
     * @param SampleRepository $repository
     */
    public function __construct(SampleRepository $repository)
    {
        $this->repository = $repository;
    }

    public function select(): array
    {
        return $this->repository->all();
    }
}