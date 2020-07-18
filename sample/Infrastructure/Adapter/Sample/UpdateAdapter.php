<?php


final class UpdateAdapter implements UpdateCommandInterface,UpdateQueryInterface
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

    public function save(SampleEntity $entity): array
    {
        $this->repository->save($entity);
    }

    public function find(): SampleEntity
    {
        return $this->repository->one();
    }
}