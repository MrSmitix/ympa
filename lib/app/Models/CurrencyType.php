<?php
/**
 * CurrencyType
 */
namespace app\Models;

/**
 * CurrencyType
 * @description Коды валют. Возможные значения: * `BYR` — белорусский рубль. * `KZT` — казахстанский тенге. * `RUR` — российский рубль. * `UAH` — украинская гривна.
 */
class CurrencyType
{
    /**
     * Possible values of this enum
     */
    const RUR = 'RUR';

    const USD = 'USD';

    const EUR = 'EUR';

    const UAH = 'UAH';

    const AUD = 'AUD';

    const GBP = 'GBP';

    const BYR = 'BYR';

    const BYN = 'BYN';

    const DKK = 'DKK';

    const ISK = 'ISK';

    const KZT = 'KZT';

    const CAD = 'CAD';

    const CNY = 'CNY';

    const NOK = 'NOK';

    const XDR = 'XDR';

    const SGD = 'SGD';

    const _TRY = 'TRY';

    const SEK = 'SEK';

    const CHF = 'CHF';

    const JPY = 'JPY';

    const AZN = 'AZN';

    const ALL = 'ALL';

    const DZD = 'DZD';

    const AOA = 'AOA';

    const ARS = 'ARS';

    const AMD = 'AMD';

    const AFN = 'AFN';

    const BHD = 'BHD';

    const BGN = 'BGN';

    const BOB = 'BOB';

    const BWP = 'BWP';

    const BND = 'BND';

    const BRL = 'BRL';

    const BIF = 'BIF';

    const HUF = 'HUF';

    const VEF = 'VEF';

    const KPW = 'KPW';

    const VND = 'VND';

    const GMD = 'GMD';

    const GHS = 'GHS';

    const GNF = 'GNF';

    const HKD = 'HKD';

    const GEL = 'GEL';

    const AED = 'AED';

    const EGP = 'EGP';

    const ZMK = 'ZMK';

    const ILS = 'ILS';

    const INR = 'INR';

    const IDR = 'IDR';

    const JOD = 'JOD';

    const IQD = 'IQD';

    const IRR = 'IRR';

    const YER = 'YER';

    const QAR = 'QAR';

    const KES = 'KES';

    const KGS = 'KGS';

    const COP = 'COP';

    const CDF = 'CDF';

    const CRC = 'CRC';

    const KWD = 'KWD';

    const CUP = 'CUP';

    const LAK = 'LAK';

    const LVL = 'LVL';

    const SLL = 'SLL';

    const LBP = 'LBP';

    const LYD = 'LYD';

    const SZL = 'SZL';

    const LTL = 'LTL';

    const MUR = 'MUR';

    const MRO = 'MRO';

    const MKD = 'MKD';

    const MWK = 'MWK';

    const MGA = 'MGA';

    const MYR = 'MYR';

    const MAD = 'MAD';

    const MXN = 'MXN';

    const MZN = 'MZN';

    const MDL = 'MDL';

    const MNT = 'MNT';

    const NPR = 'NPR';

    const NGN = 'NGN';

    const NIO = 'NIO';

    const NZD = 'NZD';

    const OMR = 'OMR';

    const PKR = 'PKR';

    const PYG = 'PYG';

    const PEN = 'PEN';

    const PLN = 'PLN';

    const KHR = 'KHR';

    const SAR = 'SAR';

    const RON = 'RON';

    const SCR = 'SCR';

    const SYP = 'SYP';

    const SKK = 'SKK';

    const SOS = 'SOS';

    const SDG = 'SDG';

    const SRD = 'SRD';

    const TJS = 'TJS';

    const THB = 'THB';

    const TWD = 'TWD';

    const BDT = 'BDT';

    const TZS = 'TZS';

    const TND = 'TND';

    const TMM = 'TMM';

    const UGX = 'UGX';

    const UZS = 'UZS';

    const UYU = 'UYU';

    const PHP = 'PHP';

    const DJF = 'DJF';

    const XAF = 'XAF';

    const XOF = 'XOF';

    const HRK = 'HRK';

    const CZK = 'CZK';

    const CLP = 'CLP';

    const LKR = 'LKR';

    const EEK = 'EEK';

    const ETB = 'ETB';

    const RSD = 'RSD';

    const ZAR = 'ZAR';

    const KRW = 'KRW';

    const NAD = 'NAD';

    const TL = 'TL';

    const UE = 'UE';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::RUR,
            self::USD,
            self::EUR,
            self::UAH,
            self::AUD,
            self::GBP,
            self::BYR,
            self::BYN,
            self::DKK,
            self::ISK,
            self::KZT,
            self::CAD,
            self::CNY,
            self::NOK,
            self::XDR,
            self::SGD,
            self::_TRY,
            self::SEK,
            self::CHF,
            self::JPY,
            self::AZN,
            self::ALL,
            self::DZD,
            self::AOA,
            self::ARS,
            self::AMD,
            self::AFN,
            self::BHD,
            self::BGN,
            self::BOB,
            self::BWP,
            self::BND,
            self::BRL,
            self::BIF,
            self::HUF,
            self::VEF,
            self::KPW,
            self::VND,
            self::GMD,
            self::GHS,
            self::GNF,
            self::HKD,
            self::GEL,
            self::AED,
            self::EGP,
            self::ZMK,
            self::ILS,
            self::INR,
            self::IDR,
            self::JOD,
            self::IQD,
            self::IRR,
            self::YER,
            self::QAR,
            self::KES,
            self::KGS,
            self::COP,
            self::CDF,
            self::CRC,
            self::KWD,
            self::CUP,
            self::LAK,
            self::LVL,
            self::SLL,
            self::LBP,
            self::LYD,
            self::SZL,
            self::LTL,
            self::MUR,
            self::MRO,
            self::MKD,
            self::MWK,
            self::MGA,
            self::MYR,
            self::MAD,
            self::MXN,
            self::MZN,
            self::MDL,
            self::MNT,
            self::NPR,
            self::NGN,
            self::NIO,
            self::NZD,
            self::OMR,
            self::PKR,
            self::PYG,
            self::PEN,
            self::PLN,
            self::KHR,
            self::SAR,
            self::RON,
            self::SCR,
            self::SYP,
            self::SKK,
            self::SOS,
            self::SDG,
            self::SRD,
            self::TJS,
            self::THB,
            self::TWD,
            self::BDT,
            self::TZS,
            self::TND,
            self::TMM,
            self::UGX,
            self::UZS,
            self::UYU,
            self::PHP,
            self::DJF,
            self::XAF,
            self::XOF,
            self::HRK,
            self::CZK,
            self::CLP,
            self::LKR,
            self::EEK,
            self::ETB,
            self::RSD,
            self::ZAR,
            self::KRW,
            self::NAD,
            self::TL,
            self::UE
        ];
    }
}
