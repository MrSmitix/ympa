<?php
/**
 * ReturnsApiInterfaceTest
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the endpoint.
 */

namespace OpenAPI\Server\Tests\Api;

use Symfony\Bundle\FrameworkBundle\KernelBrowser;
use Symfony\Bundle\FrameworkBundle\Test\WebTestCase;

/**
 * ReturnsApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Api\ReturnsApiInterface
 */
class ReturnsApiInterfaceTest extends WebTestCase
{
    private static ?KernelBrowser $client = null;

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        if (null === self::$client) {
            self::$client = static::createClient();
        }
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        static::ensureKernelShutdown();
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test case for getReturn
     *
     * Информация о невыкупе или возврате.
     *
     */
    public function testGetReturn(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{orderId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{returnId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for getReturn not implemented');
    }

    /**
     * Test case for getReturnApplication
     *
     * Получение заявления на возврат.
     *
     */
    public function testGetReturnApplication(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{orderId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{returnId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for getReturnApplication not implemented');
    }

    /**
     * Test case for getReturnPhoto
     *
     * Получение фотографии возврата.
     *
     */
    public function testGetReturnPhoto(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{orderId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{returnId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{itemId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{imageHash}';
        $data = $this->genTestData('[a-z0-9]+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for getReturnPhoto not implemented');
    }

    /**
     * Test case for getReturns
     *
     * Список невыкупов и возвратов.
     *
     */
    public function testGetReturns(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/returns';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for getReturns not implemented');
    }

    /**
     * Test case for setReturnDecision
     *
     * Принятие или изменение решения по возврату.
     *
     */
    public function testSetReturnDecision(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{orderId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{returnId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for setReturnDecision not implemented');
    }

    /**
     * Test case for submitReturnDecision
     *
     * Подтверждение решения по возврату.
     *
     */
    public function testSubmitReturnDecision(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{orderId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{returnId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
        $this->markTestSkipped('Test for submitReturnDecision not implemented');
    }

    /**
     * @param string $regexp
     * @return mixed
     */
    protected function genTestData(string $regexp)
    {
        $grammar  = new \Hoa\File\Read('hoa://Library/Regex/Grammar.pp');
        $compiler = \Hoa\Compiler\Llk\Llk::load($grammar);
        $ast      = $compiler->parse($regexp);
        $generator = new \Hoa\Regex\Visitor\Isotropic(new \Hoa\Math\Sampler\Random());

        return $generator->visit($ast);
    }
}
