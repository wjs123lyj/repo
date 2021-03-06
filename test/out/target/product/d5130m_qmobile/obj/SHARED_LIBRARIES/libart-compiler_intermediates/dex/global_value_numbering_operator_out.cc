#include <iostream>

#include "dex/global_value_numbering.h"

// This was automatically generated by art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const GlobalValueNumbering::Mode& rhs) {
  switch (rhs) {
    case GlobalValueNumbering::kModeGvn: os << "ModeGvn"; break;
    case GlobalValueNumbering::kModeGvnPostProcessing: os << "ModeGvnPostProcessing"; break;
    case GlobalValueNumbering::kModeLvn: os << "ModeLvn"; break;
    default: os << "GlobalValueNumbering::Mode[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art

