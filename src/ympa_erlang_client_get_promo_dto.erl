-module(ympa_erlang_client_get_promo_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_dto/0]).

-type ympa_erlang_client_get_promo_dto() ::
    #{ 'id' := binary(),
       'name' := binary(),
       'period' := ympa_erlang_client_promo_period_dto:ympa_erlang_client_promo_period_dto(),
       'participating' := boolean(),
       'assortmentInfo' := ympa_erlang_client_get_promo_assortment_info_dto:ympa_erlang_client_get_promo_assortment_info_dto(),
       'mechanicsInfo' := ympa_erlang_client_get_promo_mechanics_info_dto:ympa_erlang_client_get_promo_mechanics_info_dto(),
       'bestsellerInfo' := ympa_erlang_client_get_promo_bestseller_info_dto:ympa_erlang_client_get_promo_bestseller_info_dto(),
       'channels' => list(),
       'constraints' => ympa_erlang_client_get_promo_constraints_dto:ympa_erlang_client_get_promo_constraints_dto()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'period' := Period,
          'participating' := Participating,
          'assortmentInfo' := AssortmentInfo,
          'mechanicsInfo' := MechanicsInfo,
          'bestsellerInfo' := BestsellerInfo,
          'channels' := Channels,
          'constraints' := Constraints
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'period' => Period,
       'participating' => Participating,
       'assortmentInfo' => AssortmentInfo,
       'mechanicsInfo' => MechanicsInfo,
       'bestsellerInfo' => BestsellerInfo,
       'channels' => Channels,
       'constraints' => Constraints
     }.
