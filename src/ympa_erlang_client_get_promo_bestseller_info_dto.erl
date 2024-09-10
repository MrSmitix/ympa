-module(ympa_erlang_client_get_promo_bestseller_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_get_promo_bestseller_info_dto/0]).

-type ympa_erlang_client_get_promo_bestseller_info_dto() ::
    #{ 'bestseller' := boolean(),
       'entryDeadline' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'bestseller' := Bestseller,
          'entryDeadline' := EntryDeadline
        }) ->
    #{ 'bestseller' => Bestseller,
       'entryDeadline' => EntryDeadline
     }.
