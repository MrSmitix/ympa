
/*
 * GoodsStatsDTO.h
 *
 * Отчет по товарам.
 */

#ifndef TINY_CPP_CLIENT_GoodsStatsDTO_H_
#define TINY_CPP_CLIENT_GoodsStatsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GoodsStatsGoodsDTO.h"
#include <list>

namespace Tiny {


/*! \brief Отчет по товарам.
 *
 *  \ingroup Models
 *
 */

class GoodsStatsDTO{
public:

    /*! \brief Constructor.
	 */
    GoodsStatsDTO();
    GoodsStatsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GoodsStatsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров.
	 */
	std::list<GoodsStatsGoodsDTO> getShopSkus();

	/*! \brief Set Список товаров.
	 */
	void setShopSkus(std::list <GoodsStatsGoodsDTO> shopSkus);


    private:
    std::list<GoodsStatsGoodsDTO> shopSkus;
};
}

#endif /* TINY_CPP_CLIENT_GoodsStatsDTO_H_ */
