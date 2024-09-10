/*
 * GoodsStatsDTO.h
 *
 * Отчет по товарам.
 */

#ifndef _GoodsStatsDTO_H_
#define _GoodsStatsDTO_H_


#include <string>
#include "GoodsStatsGoodsDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Отчет по товарам.
 *
 *  \ingroup Models
 *
 */

class GoodsStatsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsStatsDTO();
	GoodsStatsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsStatsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров.
	 */
	std::list<GoodsStatsGoodsDTO> getShopSkus();

	/*! \brief Set Список товаров.
	 */
	void setShopSkus(std::list <GoodsStatsGoodsDTO> shopSkus);

private:
	std::list <GoodsStatsGoodsDTO>shopSkus;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsStatsDTO_H_ */
