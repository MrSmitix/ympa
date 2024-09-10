-module(ympa_erlang_proper_client_get_promo_bestseller_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_promo_bestseller_info_dto/0]).

-export([ympa_erlang_proper_client_get_promo_bestseller_info_dto/1]).

-export_type([ympa_erlang_proper_client_get_promo_bestseller_info_dto/0]).

-type ympa_erlang_proper_client_get_promo_bestseller_info_dto() ::
  [ {'bestseller', boolean() }
  | {'entryDeadline', datetime() }
  ].


ympa_erlang_proper_client_get_promo_bestseller_info_dto() ->
    ympa_erlang_proper_client_get_promo_bestseller_info_dto([]).

ympa_erlang_proper_client_get_promo_bestseller_info_dto(Fields) ->
  Default = [ {'bestseller', boolean() }
            , {'entryDeadline', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

