<?php


final class SampleRepository implements SampleRepositoryInterface
{
    private AClient $aClient;

    private ADao $aDao;

    private AFile $aFile;

    /**
     * SampleRepository constructor.
     * @param AClient $aClient
     * @param ADao $aDao
     * @param AFile $aFile
     */
    public function __construct(AClient $aClient, ADao $aDao, AFile $aFile)
    {
        $this->aClient = $aClient;
        $this->aDao = $aDao;
        $this->aFile = $aFile;
    }

    public function one(): SampleEntity
    {
        $this->aFile->sample();

        return new SampleEntity(new Sample);
    }

    public function all(): array
    {
        $this->aDao->sample();
        return [new SampleEntity(new Sample)];
    }

    public function save(SampleEntity $entity): void
    {
        $this->aClient->sample();;
    }
}