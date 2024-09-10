<?php
/**
 * GetPromoConstraintsDTO
 */
namespace app\Models;

/**
 * GetPromoConstraintsDTO
 * @description Ограничения в акции.
 */
class GetPromoConstraintsDTO {

    /** @var int[]|null $warehouseIds Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.*/
    public $warehouseIds = null;

}
