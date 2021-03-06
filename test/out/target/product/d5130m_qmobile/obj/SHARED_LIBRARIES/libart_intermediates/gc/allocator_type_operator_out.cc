#include <iostream>

#include "gc/allocator_type.h"

// This was automatically generated by art/tools/generate-operator-out.py --- do not edit!
namespace art {
namespace gc {
std::ostream& operator<<(std::ostream& os, const AllocatorType& rhs) {
  switch (rhs) {
    case kAllocatorTypeBumpPointer: os << "AllocatorTypeBumpPointer"; break;
    case kAllocatorTypeTLAB: os << "AllocatorTypeTLAB"; break;
    case kAllocatorTypeRosAlloc: os << "AllocatorTypeRosAlloc"; break;
    case kAllocatorTypeDlMalloc: os << "AllocatorTypeDlMalloc"; break;
    case kAllocatorTypeNonMoving: os << "AllocatorTypeNonMoving"; break;
    case kAllocatorTypeLOS: os << "AllocatorTypeLOS"; break;
    case kAllocatorTypeRegion: os << "AllocatorTypeRegion"; break;
    case kAllocatorTypeRegionTLAB: os << "AllocatorTypeRegionTLAB"; break;
    default: os << "AllocatorType[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace gc
}  // namespace art

