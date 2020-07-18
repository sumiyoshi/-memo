<?php


interface SampleRepositoryInterface
{
    /**
     * @return SampleEntity
     */
    public function one(): SampleEntity;

    /**
     * @return SampleEntity[]
     */
    public function all(): array;

    /**
     * @param SampleEntity $entity
     */
    public function save(SampleEntity $entity): void;
}