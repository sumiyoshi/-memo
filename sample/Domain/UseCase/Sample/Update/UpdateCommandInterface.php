<?php


interface UpdateCommandInterface
{
    public function save(SampleEntity $entity): array;
}