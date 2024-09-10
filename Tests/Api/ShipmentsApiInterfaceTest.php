<?php
/**
 * ShipmentsApiInterfaceTest
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
 * ShipmentsApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Api\ShipmentsApiInterface
 */
class ShipmentsApiInterfaceTest extends WebTestCase
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
     * Test case for confirmShipment
     *
     * Подтверждение отгрузки.
     *
     */
    public function testConfirmShipment(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for confirmShipment not implemented');
    }

    /**
     * Test case for downloadShipmentAct
     *
     * Получение акта приема-передачи.
     *
     */
    public function testDownloadShipmentAct(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for downloadShipmentAct not implemented');
    }

    /**
     * Test case for downloadShipmentDiscrepancyAct
     *
     * Получение акта расхождений.
     *
     */
    public function testDownloadShipmentDiscrepancyAct(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for downloadShipmentDiscrepancyAct not implemented');
    }

    /**
     * Test case for downloadShipmentInboundAct
     *
     * Получение фактического акта приема-передачи.
     *
     */
    public function testDownloadShipmentInboundAct(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for downloadShipmentInboundAct not implemented');
    }

    /**
     * Test case for downloadShipmentPalletLabels
     *
     * Ярлыки для доверительной приемки (FBS).
     *
     */
    public function testDownloadShipmentPalletLabels(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for downloadShipmentPalletLabels not implemented');
    }

    /**
     * Test case for downloadShipmentReceptionTransferAct
     *
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее.
     *
     */
    public function testDownloadShipmentReceptionTransferAct(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/shipments/reception-transfer-act';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for downloadShipmentReceptionTransferAct not implemented');
    }

    /**
     * Test case for downloadShipmentTransportationWaybill
     *
     * Получение транспортной накладной.
     *
     */
    public function testDownloadShipmentTransportationWaybill(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for downloadShipmentTransportationWaybill not implemented');
    }

    /**
     * Test case for getShipment
     *
     * Получение информации об одной отгрузке.
     *
     */
    public function testGetShipment(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for getShipment not implemented');
    }

    /**
     * Test case for getShipmentOrdersInfo
     *
     * Получение информации о возможности печати ярлыков (FBS).
     *
     */
    public function testGetShipmentOrdersInfo(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for getShipmentOrdersInfo not implemented');
    }

    /**
     * Test case for searchShipments
     *
     * Получение информации о нескольких отгрузках.
     *
     */
    public function testSearchShipments(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('PUT', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for searchShipments not implemented');
    }

    /**
     * Test case for setShipmentPalletsCount
     *
     * Передача количества упаковок в отгрузке.
     *
     */
    public function testSetShipmentPalletsCount(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('PUT', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for setShipmentPalletsCount not implemented');
    }

    /**
     * Test case for transferOrdersFromShipment
     *
     * Перенос заказов в следующую отгрузку.
     *
     */
    public function testTransferOrdersFromShipment(): void
    {
        $client = self::$client;

        $path = '/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer';
        $pattern = '{campaignId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{shipmentId}';
        $data = $this->genTestData('\d+');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for transferOrdersFromShipment not implemented');
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
