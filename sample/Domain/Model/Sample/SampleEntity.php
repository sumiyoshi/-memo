<?php


final class SampleEntity
{
    private Sample $sample;

    /**
     * SampleEntity constructor.
     * @param Sample $sample
     */
    public function __construct(Sample $sample)
    {
        $this->sample = $sample;
    }
}