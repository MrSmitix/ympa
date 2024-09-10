<?php
/**
 * ChatMessageDTOTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
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
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\ChatMessageDTO;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * ChatMessageDTOTest Class Doc Comment
 *
 * @category    Class
 * @description Информация о сообщениях.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\ChatMessageDTO
 */
class ChatMessageDTOTest extends TestCase
{
    protected ChatMessageDTO|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(ChatMessageDTO::class)->getMockForAbstractClass();
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(ChatMessageDTO::class));
        $this->assertInstanceOf(ChatMessageDTO::class, $this->object);
    }

    /**
     * Test attribute "messageId"
     *
     * @group unit
     * @small
     */
    public function testPropertyMessageId(): void
    {
        $this->markTestSkipped('Test for property messageId not implemented');
    }

    /**
     * Test attribute "createdAt"
     *
     * @group unit
     * @small
     */
    public function testPropertyCreatedAt(): void
    {
        $this->markTestSkipped('Test for property createdAt not implemented');
    }

    /**
     * Test attribute "sender"
     *
     * @group unit
     * @small
     */
    public function testPropertySender(): void
    {
        $this->markTestSkipped('Test for property sender not implemented');
    }

    /**
     * Test attribute "message"
     *
     * @group unit
     * @small
     */
    public function testPropertyMessage(): void
    {
        $this->markTestSkipped('Test for property message not implemented');
    }

    /**
     * Test attribute "payload"
     *
     * @group unit
     * @small
     */
    public function testPropertyPayload(): void
    {
        $this->markTestSkipped('Test for property payload not implemented');
    }
}
