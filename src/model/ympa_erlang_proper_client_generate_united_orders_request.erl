-module(ympa_erlang_proper_client_generate_united_orders_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_generate_united_orders_request/0]).

-export([ympa_erlang_proper_client_generate_united_orders_request/1]).

-export_type([ympa_erlang_proper_client_generate_united_orders_request/0]).

-type ympa_erlang_proper_client_generate_united_orders_request() ::
  [ {'businessId', integer() }
  | {'dateFrom', date() }
  | {'dateTo', date() }
  | {'campaignIds', list(integer()) }
  | {'promoId', binary() }
  ].


ympa_erlang_proper_client_generate_united_orders_request() ->
    ympa_erlang_proper_client_generate_united_orders_request([]).

ympa_erlang_proper_client_generate_united_orders_request(Fields) ->
  Default = [ {'businessId', integer() }
            , {'dateFrom', date() }
            , {'dateTo', date() }
            , {'campaignIds', list(integer()) }
            , {'promoId', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

